<template>
  <el-row >
    <el-col :span="22" type="flex" justify="start" >
      <div>
        <el-menu default-active="5" router class="el-menu-demo" mode="horizontal">
          <el-menu-item index="1" :route="{path:'/'}">RedisConsole</el-menu-item>
          <el-menu-item index="2"></el-menu-item>
          <el-menu-item index="3" :route="{path:'/config'}">查询配置</el-menu-item>
          <el-menu-item index="4" :route="{path:'/command'} ">执行命令</el-menu-item>
        </el-menu>
      </div>
    </el-col>
    <el-col :span="2" type="flex" justify="end" >
      <div v-if="username !==null && username !== ''">
        <el-menu default-active="5" class="el-menu-demo" mode="horizontal">
          <el-submenu index="5">
            <template slot="title">{{username}}</template>
            <!--
            <el-menu-item index="5-1">个人中心</el-menu-item>
            -->
            <el-menu-item index="5-2" @click="handleLogout">退出登录</el-menu-item>
          </el-submenu>
        </el-menu>
      </div>
      <div v-else>
        <el-menu default-active="5" class="el-menu-demo" mode="horizontal">
            <el-menu-item index="5-2" @click="handleLogin">请登录</el-menu-item>
        </el-menu>
      </div>
    </el-col>
  </el-row>
</template>

<script>
import {getCookie, setCookie, delCookie} from '../util/CookieUtils'

export default {
  name: 'Header',
  data () {
    return {
      username: ''
    }
  },
  methods: {
    handleLogin () {
      setCookie('username', 'liuil', 1)
      this.username = getCookie('username')
      console.log('2' + getCookie('username'))
    },
    handleLogout () {
      delCookie('username')
      this.username = getCookie('username')
      console.log('cookie is deleted')
    },
    getUsername () {
      console.log('1' + getCookie('username'))
      return getCookie('username')
    }
  }
}
</script>

<style scoped>
</style>
