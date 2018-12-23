<template>
  <el-row>
    <el-col :span="24">
      <div>
        <el-menu default-active="5" router class="el-menu-demo" mode="horizontal">
          <el-menu-item index="1" :route="{path:'/'}">RedisConsole</el-menu-item>
          <el-menu-item index="2"></el-menu-item>
          <el-menu-item index="3" :route="{path:'/config'}">查询配置</el-menu-item>
          <el-menu-item index="4" :route="{path:'/command'}">执行命令</el-menu-item>
        </el-menu>
      </div>

    </el-col>
  </el-row>
</template>

<script>
export default {
  name: 'Header'
}
</script>

<style scoped>
</style>
