<template>
    <div class="container">
           <h2>Employee Form</h2>  <hr/>
       <form @submit.prevent="onCreatePost">
            
           <div class="form-group">
               <label>First Name</label>
               <input type="text" class="form-control" v-model="firstName" placeholder="firstName">
           </div>
                
            <div class="form-group">
               <label for="lastName">Last Name</label>
               <input type="text" class="form-control" v-model="lastName" placeholder="lastName">
            </div>
  
            <div class="form-group">
               <label for="Email">Email</label>
               <input type="email" class="form-control" v-model="email" placeholder="Email">
            </div>
            
            <button type="submit" class="mt-3">Register</button>
        </form>

    </div>
</template>
<script>
import EmployeeService from '../services/EmployeeService'

export default{
    data() {
        return {
            firstName:'',
            lastName:'',
            email:''
        };
    },
    methods:{
        onCreatePost(){
            EmployeeService.createEmployee({
                firstName:this.firstName,
                lastName:this.lastName,
                email:this.email
            }).then((response)=>{
                console.log(response);
                this.$router.push('/employee')
            });

        }
    }
}


</script>
