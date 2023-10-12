<template>
  <div class="page-addcase">
    <h1>Add Case</h1>
    <div class="ui centered grid container">
      <div class="nine wide column">
        <div class="ui fluid card">
          <div class="content">
            <form class="ui form" @submit.prevent="submitCase" method="POST">
              <div class="grouped fields">
                <label>Are you referring on someone's behalf?</label>
                <div class="field">
                  <div class="ui radio checkbox">
                    <input type="radio" name="referral" v-model="isReferral" :value="isReferral" :checked="isReferral"
                           v-on:click="this.isReferral = !this.isReferral;">
                    <label>Yes</label>
                  </div>
                </div>
                <div class="field">
                  <div class="ui radio checkbox">
                    <input type="radio" name="nonreferral" v-model="isReferral" :value="isReferral"
                           :checked="!isReferral"
                           v-on:click="this.isReferral = !this.isReferral;">
                    <label>No</label>
                  </div>
                </div>
              </div>
              <div v-show="isReferral">
                <h4>Referree Details</h4>
                <div class="three fields">
                  <div class="required field"
                       v-bind:class="this.refFirstName.length === 0 ? 'required field error': 'required field'">
                    <label>First name</label>
                    <input type="text" placeholder="First Name" v-model="refFirstName">
                  </div>
                  <div class="field">
                    <label>Middle name</label>
                    <input type="text" placeholder="Middle Name" v-model="refMiddleName">
                  </div>
                  <div class="required field"
                       v-bind:class="this.refLastName.length === 0 ? 'required field error': 'required field'">
                    <label>Last name</label>
                    <input type="text" placeholder="Last Name" v-model="refLastName">
                  </div>
                </div>
              </div>
              <h4>Client Details</h4>
              <div class="three fields">
                <div class="required field"
                     v-bind:class="this.firstName.length === 0 ? 'required field error': 'required field'">
                  <label>First name</label>
                  <input type="text" placeholder="First Name" v-model="firstName">
                </div>
                <div class="field">
                  <label>Middle name</label>
                  <input type="text" placeholder="Middle Name" v-model="middleName">
                </div>
                <div class="required field"
                     v-bind:class="this.lastName.length === 0 ? 'required field error': 'required field'">
                  <label>Last name</label>
                  <input type="text" placeholder="Last Name" v-model="lastName">
                </div>
              </div>
              <div class="required field"
                   v-bind:class="this.email.dob === 0 ? 'required field error': 'required field'">
                <label>Date of birth:</label>
                <input id="dob" type="date" name="dob" placeholder="Client email" v-model="dob" :max="dobMax" >
              </div>

              <div class="required field"
                   v-bind:class="this.email.length === 0 ? 'required field error': 'required field'">
                <label>Email</label>
                <input type="text" name="email" placeholder="Client email" v-model="email">
              </div>
              <div class="required field"
                   v-bind:class="this.phoneNumber.length === 0 ? 'required field error': 'required field'">
                <label>Phone number</label>
                <input type="text" name="phonenumber" placeholder="Client phone no." v-model="phoneNumber">
              </div>
              <div class="field">
                <label>Address 1</label>
                <input type="text" name="address" placeholder="Client address 1" v-model="address1">
              </div>
              <div class="field">
                <label>Address 2</label>
                <input type="text" name="address" placeholder="Client address 2" v-model="address2">
              </div>
              <div class="field">
                <label>Zip code</label>
                <input type="text" name="zipcode" placeholder="Zip code" v-model="zipCode">
              </div>
              <div class="required field" v-bind:class="this.category == 0 ? 'required field error': 'required field'">
                <label>What do you consider to be your main difficulty?</label>
                <select v-model="category">
                  <option value="0">Please select an option from the dropdown</option>
                  <option value="1">Bereavement</option>
                  <option value="2">Domestic Abuse</option>
                  <option value="3">Divorce/Separation</option>
                  <option value="6">Children Looked After</option>
                  <option value="7">Suicide Bereavement</option>
                  <option value="8">Depression</option>
                  <option value="9">Anxiety</option>
                  <option value="10">Stress</option>
                  <option value="11">Gender Identity/Sexuality</option>
                  <option value="12">Other</option>
                </select>
              </div>
              <div class="required field"
                   v-bind:class="this.gpName.length === 0 ? 'required field error': 'required field'">
                <label>GP Name</label>
                <input type="text" name="gpname" placeholder="General Practitioner Name" v-model="gpName">
              </div>
              <button class="ui primary labeled icon button" type="submit" @click="submitCase">
                <i class="user circle icon"></i>
                Submit
              </button>
              <button class="ui button" style="margin-left: 5px;" @click="clearForm" type="button">
                Clear Form
              </button>
            </form>
          </div>
        </div>
        <div v-show="formSubmitError" class="ui icon error message">
          <i class="lock icon"></i>
          <div class="content">
            <div class="header">
              Case creation failed!
            </div>
            <p>Please fill all the mandatory fields</p>
          </div>
        </div>
        <div v-show="fieldError" class="ui icon error message">
          <i class="lock icon"></i>
          <div class="content">
            <div class="header">
              Case creation failed!
            </div>
            <p>{{ errorField }} is invalid!</p>
          </div>
        </div>
        <div v-show="validationPassed" class="ui icon success message">
          <i class="check icon"></i>
          <div class="content">
            <div class="header">
              Case created successfully!
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import CaseService from '../services/CaseService'

export default {
  name: 'AddCase',
  data() {
    return {
      isReferral: true,
      refFirstName: '',
      refMiddleName: '',
      refLastName: '',
      firstName: '',
      middleName: '',
      lastName: '',
      email: '',
      phoneNumber: '',
      address1: '',
      address2: '',
      zipCode: '',
      category: '',
      gpName: '',
      errorField: '',
      dob: '',
      formSubmitError: false,
      validationPassed: false,
      fieldError: false,
      dobMax: ''
    }
  },
  created() {
    var today = new Date();
    var dd = today.getDate();
    var mm = today.getMonth()+1; //January is 0!
    var yyyy = today.getFullYear();
    if(dd<10){
      dd='0'+dd
    }
    if(mm<10){
      mm='0'+mm
    }

    today = yyyy+'-'+mm+'-'+dd;
    console.log("today = " + today);
    this.dobMax = today;
  },
  methods: {
    submitCase() {
      if (!this.validateEmail(this.email)) {
        this.errorField = "Email"
        this.fieldError = true
        return
      }
      // if (this.phoneNumber.length !== 10 || !/^\d+$/.test(this.phoneNumber)) {
      //   this.errorField = "Phone number"
      //   this.fieldError = true
      //   return
      // }
      if (!this.validateForm()) {
        return
      }

      CaseService.createCase({
        isReferral: this.isReferral,
        refFirstName: this.refFirstName,
        refMiddleName: this.refMiddleName,
        refLastName: this.refLastName,
        firstName: this.lastName,
        middleName: this.middleName,
        lastName: this.lastName,
        dob: this.dob,
        email: this.email,
        phoneNumber: this.phoneNumber,
        address1: this.address1,
        address2: this.address2,
        zipCode: this.zipCode,
        category: this.category,
        gpName: this.gpName
      }).then((response) => {
        console.log(response);
        //This is the redirect URI in case of success
        // this.$router.push('/employee')
        console.log("Response success maybe?")
        this.validationPassed = true
        this.fieldError = false
        this.formSubmitError = false
      });
      console.log("Submit clicked!")
      console.log("isReferral: " + this.isReferral)
      console.log("firstName: " + this.firstName)
      console.log("middleName: " + this.middleName)
      console.log("lastName: " + this.lastName)
      console.log("email: " + this.email)
      console.log("phoneNumber: " + this.phoneNumber)
      console.log("address1: " + this.address1)
      console.log("address2: " + this.address2)
      console.log("zipCode: " + this.zipCode)
      console.log("category: " + this.category)
      console.log("gpName: " + this.gpName)
      console.log("dob: " + this.dob)
    },
    clearForm() {
      this.isReferral = true
      this.refFirstName = ''
      this.refMiddleName = ''
      this.refLastName = ''
      this.firstName = ''
      this.middleName = ''
      this.lastName = ''
      this.email = ''
      this.phoneNumber = ''
      this.address1 = ''
      this.address2 = ''
      this.zipCode = ''
      this.category = ''
      this.gpName = ''
      this.errorField = ''
      this.validationPassed = false
      this.formSubmitError = false
      this.fieldError = false
      this.dob = ''
    },
    validateForm() {
      if (this.isReferral) {
        if (this.firstName.length === 0 || this.lastName.length === 0 || this.email.length === 0 || this.phoneNumber.length === 0 ||
            this.category == 0 || this.gpName.length === 0 || this.refFirstName.length === 0 || this.refLastName.length === 0 || this.dob.length === 0) {
          this.validationPassed = false
          this.formSubmitError = true
          return false
        }
        else {
          this.formSubmitError = false
          return true
        }
      }
      else if (this.firstName.length === 0 || this.lastName.length === 0 || this.email.length === 0 || this.phoneNumber.length === 0 ||
          this.category == 0 || this.gpName.length === 0 || this.dob.length === 0) {
        this.validationPassed = false
        this.formSubmitError = true
        return false
      } else {
        this.formSubmitError = false
        return true
      }
    },
    validateEmail(email) {
      return String(email)
          .toLowerCase()
          .match(
              /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|.(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/
          );
    }
  }
}

</script>
<style scoped>

</style>
<script setup>
</script>