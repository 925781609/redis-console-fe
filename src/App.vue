<template>
  <div id="app">
    <el-container>
      <el-header>RedisConsole</el-header>
      <el-container>
        <el-aside width="200px">
          <navmenu></navmenu>
        </el-aside>
        <el-main>执行命令</el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
// @ is alias for src defined in webpack.base.conf.js
import NavMenu from '@/components/NavMenu'

export default {
  name: 'App',
  components: {
    'navmenu': NavMenu
  }
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
