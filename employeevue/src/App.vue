<template>
  <div id="nav">
<!--    <router-link to="/">Login</router-link> |-->
<!--    <router-link to="/home">Home</router-link> |-->
<!--    <router-link to="/employee">Employee List</router-link> |-->
<!--    <router-link to="/employeeForm"> Employee Registration Form</router-link>-->
  </div>
  <router-view/>
</template>

<script>
import Employee from "@/views/Employee.vue";

export default {
  name: 'App',
  data() {
    return {
      isLoggedIn: false
    }
  },
  created() {
    console.log("isLoggedIn = " + this.isLoggedIn)
  },
  components: {
    Employee
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
