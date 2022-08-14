<template>
  <div>
    <div class="input-container">
      <form action="#" class="form">
        <div class="input-field">
          <label for="numOfCombo">How many combo do you want to check:</label>
          <input type="text" id="numOfCombo" />
        </div>
        <button class="button-27" role="button">Check Combo</button>
      </form>
    </div>
    <div class="combo-container">
      <div class="card">
        <table>
          <thead id="header">
            <tr>
              <th>Fight No.</th>
              <th>Name</th>
              <th>Salary</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>1</td>
              <td>John Doe</td>
              <td>10,000</td>
            </tr>
            <tr>
              <td>1</td>
              <td>John Doe</td>
              <td>10,000</td>
            </tr>
          </tbody>
          <tfoot>
            <tr>
              <td colspan="3">Total Salary:</td>
            </tr>
          </tfoot>
        </table>
      </div>
      <div class="card">
        <table>
          <thead id="header">
            <tr>
              <th>Fight No.</th>
              <th>Name</th>
              <th>Salary</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>1</td>
              <td>John Doe</td>
              <td>10,000</td>
            </tr>
            <tr>
              <td>1</td>
              <td>John Doe</td>
              <td>10,000</td>
            </tr>
          </tbody>
          <tfoot>
            <tr>
              <td colspan="3">Total Salary:</td>
            </tr>
          </tfoot>
        </table>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "the-combo",
};
</script>

<style scoped>
table {
  padding: 1.5em;
  border-collapse: collapse;
  width: 100%;
  margin: 0 auto;
  box-shadow: #1c3879 0px 0px 0px 3px;
}
thead {
  border-bottom: 2px solid hsla(200, 56%, 78%, 0.063);
  height: 80px;
  background-color: #1c3879;
  color: white;
}
th,
td {
  padding: 2.5em;
  font-size: 1.05em;
  font-weight: 700;
}
tbody > tr:nth-child(even) {
  background-color: #607eaa44;
}
tbody > tr:nth-child(odd) {
  background-color: #607eaa76;
}
.combo-container {
  display: flex;
  flex-direction: row;
  column-gap: 50px;
  width: 80%;
  margin: 50px auto;
  justify-content: space-around;
}
tfoot {
  text-align: right;
}
</style>
