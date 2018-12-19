<template>
  <el-row class="tac">
    <!-- 侧边栏宽度-->
    <el-col :span="24">
      <el-menu default-active="2" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose"
               unique-opened router background-color="#545c64" text-color="#fff" active-text-color="#ffd04b">
        <el-menu-item index="1">
          <i class="el-icon-search"></i>
          <span slot="title">查找</span>
        </el-menu-item>
        <el-submenu index="2">
          <template slot="title">
            <i class="el-icon-location"></i>
            <span>Cluster</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="2-1">cluster1</el-menu-item>
            <el-menu-item index="2-2">cluster2</el-menu-item>
          </el-menu-item-group>
        </el-submenu>
        <el-submenu index="3">
          <template slot="title">
            <i class="el-icon-location"></i>
            <span>Sentinel</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="3-1">sentinel1</el-menu-item>
            <el-menu-item index="3-2">sentinel2</el-menu-item>
          </el-menu-item-group>
        </el-submenu>
        <el-submenu index="4">
          <template slot="title">
            <i class = "el-icon-location"></i>
            <span>Standalone</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="4-1">standalone1</el-menu-item>
            <el-menu-item index="4-2">standalone2</el-menu-item>
          </el-menu-item-group>
        </el-submenu>
        <el-menu-item index="5">
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
