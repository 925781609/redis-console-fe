import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    // 默认值为''
    redis: ''
  },
  actions: {
    selectRedis (ctx, redis) {
      ctx.commit('selectRedis', redis)
    }
  },
  mutations: {
    selectRedis (state, redis) {
      state.redis = redis
    }
  }
})
