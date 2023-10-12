
<script setup>

</script>

<template>
  <div class="ui centered grid container">
  <div class="ui card">
    <div class="content">
      <div class="header">CASE DETAILS</div>
      <div class="meta">2 days ago</div>
      <br>
      <div class="description">
        <p><b>CASE STATUS</b></p>
        <div class="ui vertical steps">
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
      </div>
      <br>
      <p>Notes</p>
      <div class="ui placeholder">
        <div class="paragraph">
          <div class="line"></div>
          <div class="line"></div>
          <div class="line"></div>
          <div class="line"></div>
          <div class="line"></div>
        </div>
        <div class="paragraph">
          <div class="line"></div>
          <div class="line"></div>
          <div class="line"></div>
        </div>
      </div>
    </div>
  </div>
  </div>
</template>

<style scoped>

</style>