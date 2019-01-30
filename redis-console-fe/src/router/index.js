import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Config from '@/components/Config'
import Command from '@/components/Command'
import Cookie from '@/components/Cookie'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/config',
      component: Config
    },
    {
      path: '/command',
      component: Command
    },
    {
      path: '/cookie',
      component: Cookie
    }
  ]
})
