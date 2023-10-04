<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/Barclays-Logo.png">
    <br>
    <br>
    <HelloWorld msg="Welcome DarthCoders"/>
    <br>

  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Home',
  components: {
    HelloWorld
  }
}
</script>

<style>
.home{
  margin-left: 400px;
  margin-right: 400px;
  margin-bottom: 400px;
}

</style>
