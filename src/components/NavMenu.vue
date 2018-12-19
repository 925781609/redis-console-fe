<template>
  <el-row class="tac">
    <el-col :span="24">
      <h5>实例信息</h5>
      <el-menu default-active="1" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose">
        <el-submenu index="1">
          <template slot="title">
            <i class="el-icon-location"></i>
            <span>Redis key查询</span>
          </template>
          <el-menu-item-group>
            <template slot="title">Cluster</template>
            <el-menu-item index="1-1">cluster1</el-menu-item>
            <el-menu-item index="1-2">cluster2</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group title="Sentinel">
            <el-menu-item index="1-3">sentinel1</el-menu-item>
          </el-menu-item-group>
          <el-submenu index="1-4">
            <template slot="title">Standalone</template>
            <el-menu-item index="1-4-1">standalone1</el-menu-item>
          </el-submenu>
        </el-submenu>
        <el-menu-item index="2">
          <i class="el-icon-menu"></i>
          <span slot="title">查找</span>
        </el-menu-item>
        <el-menu-item index="3">
          <i class="el-icon-setting"></i>
          <span slot="title">设置</span>
        </el-menu-item>

      </el-menu>
    </el-col>
  </el-row>
</template>

<script>
export default {
  name: 'NavMenu',
  methods: {
    handleOpen (key, keyPath) {
      console.log(key, keyPath)
    },
    handleClose (key, keyPath) {
      console.log(key, keyPath)
    }
  }
}
</script>

<style scoped>

</style>
