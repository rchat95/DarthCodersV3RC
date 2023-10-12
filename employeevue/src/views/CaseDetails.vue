
<script setup>

</script>

<template>
  <div class="ui centered grid container">
<!--  <div class="ui card">-->
    <div class="content">
      <div class="header"><h2>CASE DETAILS</h2></div>
      <div class="meta">2 days ago</div>
      <br>
      <div class="ui image label">
        Anxiety
        <i class="delete icon"></i>
      </div>
      <div class="ui image label">
        Depression
        <i class="delete icon"></i>
      </div>

      <div class="ui image label">
        Stress
        <i class="delete icon"></i>
      </div>
      <br>
      <div class="description">
        <h4 align="left">CASE STATUS</h4>

        <div class="ui horizontal steps">
          <div class="completed step">
            <i class="question circle outline icon"></i>
            <div class="content">
              <div class="title">Case Created</div>
            </div>
          </div>
          <div class="completed step">
            <i class="question circle outline icon"></i>
            <div class="content">
              <div class="title">Assigned to Counsellor</div>
            </div>
          </div>
          <div class="completed step">
            <i class="question circle outline icon"></i>
            <div class="content">
              <div class="title">Assigned to Therapist</div>
            </div>
          </div>
          <div class="active step">
            <i class="info icon"></i>
            <div class="content">
              <div class="title">Case closed</div>
            </div>
          </div>
        </div>

        <br>

<!--        <div align="left" class="grouped fields">-->
<!--          <div class="field">-->
<!--            <div class="ui radio checkbox">-->
<!--              <input type="radio" name="counsellor" v-model="isCounsellor" :value="isCounsellor" :checked="isCounsellor"-->
<!--                     v-on:click="this.isCounsellor = !this.isCounsellor;">-->
<!--              <label>Counsellor</label>-->
<!--            </div>-->
<!--          </div>-->
<!--          <div class="field">-->
<!--            <div class="ui radio checkbox">-->
<!--              <input type="radio" name="noncounsellor" v-model="isCounsellor" :value="isCounsellor"-->
<!--                     :checked="!isCounsellor"-->
<!--                     v-on:click="this.isCounsellor = !this.isCounsellor;">-->
<!--              <label>Not a Counsellor</label>-->
<!--            </div>-->
<!--          </div>-->
<!--        </div>-->
        <br>

        <div align="left" v-show="isCounsellor">
          <h4>Select therapist</h4>
          <div class="fields">
            <select v-model="therapistName">
              <option value="0">Name1</option>
              <option value="1">Name2</option>
              <option value="2">Name3</option>
              <option value="3">Name4</option>
              <option value="6">Name5</option>
              <option value="7">Name6</option>
              <option value="8">Name7</option>
              <option value="9">Name8</option>
              <option value="10">Name9</option>
              <option value="11">Name10</option>
              <option value="12">Name11</option>
            </select>
          </div>
        </div>
        <br>
      </div>
      <br>
      <p align="left">Notes</p>
      <div class="ui form">
        <div class="field">
          <textarea></textarea>
        </div>
        <button class="ui left floated button" type="submit">Submit Notes</button>
      </div>
<!--    </div>-->
  </div>
  </div>
</template>

<style scoped>

</style>