<template>
  <div>
    <el-form ref="execute" :model="cookie" label-width="40px">
      <el-form-item>
        <el-button type="primary" @click="setCookie">设置cookie</el-button>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="clearCookie">清除cookie</el-button>
      </el-form-item>
    </el-form>
    结果：<textarea cols="30" rows="10" v-model="username"></textarea>
  </div>
</template>

<script>
import {getCookie} from '../util/CookieUtils'

export default {
  name: 'Command',
  data () {
    return {
      response: [],
      username: 'default'
    }
  },
  methods: {
    setCookie () {
      this.$axios
        .get('/cookie/add').then(response => {
          console.log('打印cookie信息')
          this.username = getCookie('username')
          console.log(this.username)
        })
        .catch(response => {
          alert(response.data.message)
        })
    },
    clearCookie () {
      this.$axios.get('cookie/clear').then(
        this.username = getCookie('username')
      )
    }
  }
}
</script>

<style scoped>

</style>
