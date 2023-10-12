<template>
  <div class="page-login">
    <h1>Login</h1>
    <div class="ui centered grid container">
      <div class="nine wide column">
        <div v-show="loginFailed" class="ui icon error message">
          <i class="lock icon"></i>
          <div class="content">
            <div class="header">
              Login failed!!!--
            </div>
            <p>You might have misspelled your username or password!</p>
          </div>
        </div>
        <div class="ui fluid card">
          <div class="content">
            <form class="ui form" method="POST">
              <div class="required field">
                <label>Username</label>
                <input type="text" name="user" placeholder="Username">
              </div>
              <div class="required field">
                <label>Password</label>
                <input type="password" name="pass" placeholder="Password">
              </div>
              <button class="ui primary labeled icon button" type="button" @click="loginClick">
                <i class="unlock alternate icon"></i>
                Login
              </button>
              <button class="ui pink labeled icon button" type="button" @click="goToRegister">
                <i class="user circle icon"></i>
                Register for an account
              </button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div class="ui star rating" data-rating="3"></div>

</template>


<script>
export default {
  name: 'Login',
  data() {
    return {
      loginFailed: false
    }
  },
  methods: {
    loginClick() {
      console.log("Login clicked!")
      //TO BE CHANGED!
      this.$router.push('/case')
    },
    goToRegister() {
      console.log("Go to Sign Up page!")
      this.$router.push('/signup')

    }
  }

}


</script>


<style scoped>

</style>