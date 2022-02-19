import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Page from '@/views/page'
import Table from '@/views/table'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },{
      path: '/page',
      name: 'Page',
      component: Page
    },{
      path: '/table',
      name: 'Table',
      component: Table
    }
  ]
})
