<template>
  <div id="app">
    <div style="margin-bottom:15px">
      <router-link to="/" style="margin-right:15px">Home</router-link>
      <router-link to="/page" style="margin-right:15px">Page</router-link>
      <router-link to="/table" >Table</router-link>
    </div>

    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
