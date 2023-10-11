<template>
  <div class="page-login">
    <h1>Sign Up</h1>
    <div class="ui centered grid container">
      <div class="nine wide column">
        <div v-show="signUpFailed" class="ui icon error message">
          <i class="lock icon"></i>
          <div class="content">
            <div class="header">
              Sign up failed!
            </div>
            <p>You might have misspelled your username or password!</p>
          </div>
        </div>
        <div class="ui fluid card">
          <div class="content">
            <form class="ui form" method="POST">
              <div class="fields">
                <div class="required field">
                  <label>First Name</label>
                  <input type="text" name="firstname" placeholder="First Name">
                </div>
                <div class="field">
                  <label>Middle Name</label>
                  <input type="text" name="firstname" placeholder="Middle Name">
                </div>
                <div class="required field">
                  <label>Last Name</label>
                  <input type="text" name="lastname" placeholder="Last Name">
                </div>
              </div>
              <div class="required field">
                <label>Gender</label>
                <select>
                  <option value="">Please select your gender</option>
                  <option value="1">Male</option>
                  <option value="0">Female</option>
                </select>
              </div>
              <div class="required field">
                <label>Email</label>
                <input type="email" name="email" placeholder="Email">
              </div>
              <div class="field">
                <label>Phone number</label>
                <input type="text" name="phonenumber" placeholder="Phone No.">
              </div>
              <div class="required inline field">
                <div class="ui checkbox">
                  <input type="checkbox" tabindex="0" class="hidden" id="terms">
                  <label for="terms">I agree to the terms and conditions</label>
                </div>
              </div>
              <button class="ui primary labeled icon button" type="button" @click="signUpClick">
                <i class="user circle icon"></i>
                Register
              </button>
              <button class="ui pink labeled icon button" type="button" @click="loginClick">
                <i class="unlock alternate icon"></i>
                Already have an account? Login
              </button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'SignUp',
  data() {
    return {}
  },
  methods: {
    loginClick() {
      this.$router.push('/')
    },
  }
}
</script>

<style scoped>
</style>