<template>
    <div>
        <h2>Employee Delete form</h2>
        <span>{{id}}</span>
    </div>
    

</template>
<script>
import EmployeeService from '../services/EmployeeService.js'

export default{
    data(){
        return{
            id:''
        };
    },
    created(){
        this.id = this.$route.params.id
        EmployeeService.deleteEmployee(this.id).then(
            (response) => { this.$router.push('/employee')} 
        );
    }
}

</script>
