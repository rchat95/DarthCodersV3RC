<template>
<div>
 <h2>Update form</h2>
         <form @submit.prevent="onEmployeeUpdate">  
             <div class="form-row"> 
             <div class="form-group ">
                 <label for="firstName" class="control-label" col-lg-6>first Name</label>        
                 <input type=text class="form-control" v-model="employeeData.firstName"> 
             </div>
             <div class="form-group">
                 <label>last Name</label>
                 <input type=text class="form-control" v-model="employeeData.lastName">
             </div>
             <div class="form-group">
                 <label>E-mail</label>
                 <input type=email class="form-control" v-model="employeeData.email">
             </div>    
            
            <button type="submit" class="mt-3">Update</button>
            </div>
        </form>

</div>
   
</template>

<script>
import EmployeeService from '../services/EmployeeService'

export default {
    
    data(){
        return {           
            id:'',            
            employeeData:{}
        };
    }, 
    methods:{
        onEmployeeUpdate() {
            console.log("inside update")
            EmployeeService.updateEmployee(this.employeeData)
                    .then((response)=>{
                        console.log(" then" ,response);
                        this.$router.push('/employee')
            });
        }
    },
    created(){
        console.log(this.$route.param)
        this.id = this.$route.params.id

        EmployeeService.getEmployeeData(this.id).then(
            response=> {
               // console.log(response.data)
                this.employeeData = response.data
            }
        );
        console.log(this.id);
    }
}

</script>
<style scoped>
.control-label{
   text-align: left !important;
}
</style>