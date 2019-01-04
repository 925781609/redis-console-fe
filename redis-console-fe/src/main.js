// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import global_ from '@/components/Global.vue'
import store from './store/index'
// 引用axios，并设置基础URL为后端服务api地址
Vue.prototype.GLOBAL = global_
var axios = require('axios')
// axios.defaults.baseURL = global_.BASE_URL
axios.defaults.baseURL = 'api/'
// 将API方法绑定到全局
Vue.prototype.$axios = axios

Vue.config.productionTip = false

Vue.use(ElementUI)

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: {App},
  template: '<App/>'
})
