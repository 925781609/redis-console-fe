<template>
  <div id="app">
    <el-container>
      <el-header class="header">
        <vheader/>
      </el-header>
      <el-container>
        <el-aside width="200px">
          <navmenu></navmenu>
        </el-aside>
        <el-main>
          <!-- 渲染匹配的组件-->
          <router-view></router-view>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
// @ is alias for src defined in webpack.base.conf.js
import NavMenu from '@/components/NavMenu'
import Header from '@/components/Header'

export default {
  name: 'App',
  components: {
    'navmenu': NavMenu,
    'vheader': Header
  }
}
</script>

<style>
  .header{
    background-color: #409EFF;
    color: #fff;
    line-height: 60px;
  }
</style>
