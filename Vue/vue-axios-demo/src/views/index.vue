<template>
  <div id="app">
    <a-input v-model="code" placeholder="Code"/>
    <a-input v-model="user.accountCode" placeholder="Account Code"/>
    <a-input v-model="user.userName" placeholder="User Name"/>
    <a-input v-model="user.password" placeholder="Password"/>
    <a-button 
      type="primary" 
      @click="list" 
      style="margin-top:20px"
      >
      List
    </a-button>
    <a-button 
      type="primary" 
      @click="getUser" 
      style="margin-top:20px"
      >
      User
    </a-button>
    <a-button 
      type="primary" 
      @click="login" 
      style="margin-top:20px"
      >
      Login
    </a-button>
  </div>
</template>

<script>
import { List, getUser, Login } from '@/api/user.js';
export default {
  name: 'App',
  data() {
    return {
      code: '',
      user: {
          accountCode: '',
          userName: '',
          password: ''
      }
    }
  },
  methods: {
    list() {
        List().then(res =>{
            console.log(res)
        })
    },
    getUser() {
        const params = this.code
        console.log(params)
        getUser(params).then(res =>{
            console.log(res)
        })
    },
    login() {
        const params = this.user
        console.log(params)
        Login(params).then(res =>{
            console.log(res)
        })
    }
  },
}
</script>

<style>
    #app {
    width: 200px;
    margin: 0 auto;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
    }
</style>
