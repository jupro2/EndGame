<template>



<!--  菜单-->
  <div>
    <el-menu
        class="el-menu-demo"
        mode="horizontal"
        :ellipsis="false"
    >

<!--        图片，无法点击-->
        <div>
          <img src="src/assets/school.jpg" style="height: 50px; width: 50px; color: white;padding-left: 10px;padding-right: 10px">
        </div>


      <div class="flex-grow" />
      <el-menu-item index="1">排行榜</el-menu-item>
      <el-sub-menu index="2">
        <template #title>Workspace</template>
        <el-menu-item index="2-1">item one</el-menu-item>
        <el-menu-item index="2-2">item two</el-menu-item>
        <el-menu-item index="2-3">item three</el-menu-item>
      </el-sub-menu>

<!--      搜索框-->
      <div style="padding-left: 900px;padding-top: 10px">
        <el-input v-model="search" placeholder="请输入..." style="width: 200px;height: 40px;"/>
        <el-button autofocus="true" style="padding: 20px" >搜索</el-button>
      </div>

    </el-menu>
  </div>


</template>

<script>
export default {
  components:{

  },
  data(){
    return{
      search :'',
      // 搜索结果
    }

  }
}



</script>

<style>

</style>