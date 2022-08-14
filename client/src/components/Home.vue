<template>
  <div>
    <div class="input-container">
      <form action="#" class="form">
        <div class="input-field">
          <label for="name">Name:</label>
          <input type="text" id="name" />
        </div>
        <div class="input-field">
          <label for="number">Fight No. </label>
          <input type="number" id="number" />
        </div>
        <div class="input-field">
          <label for="salary">Salary:</label>
          <input type="text" id="salary" />
        </div>
        <button class="button-27" role="button">Add</button>
      </form>
    </div>
    <div class="list-container">
      <table>
        <thead id="header">
          <tr>
            <th>Fight No.</th>
            <th>Name</th>
            <th>Salary</th>
            <th>Delete</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>1</td>
            <td>John Doe</td>
            <td>10,000</td>
            <td>
              <font-awesome-icon
                icon="fa-solid fa-xmark"
                :style="{ color: 'red' }"
                class="delete-icon"
              />
            </td>
          </tr>
          <tr>
            <td>1</td>
            <td>John Doe</td>
            <td>10,000</td>
            <td>
              <font-awesome-icon
                icon="fa-solid fa-xmark"
                :style="{ color: 'red' }"
                class="delete-icon"
              />
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
export default {
  name: "the-home",
};
</script>

<style>
.form {
  padding: 100px;
  display: flex;
  flex-direction: row;
  column-gap: 20px;
  justify-content: center;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2), 0 6px 20px rgba(0, 0, 0, 0.19);
  width: 80%;
  margin: 20px auto;
  font-size: large;
  font-weight: 700;
  align-items: baseline;
}
.input-field {
  display: flex;
  column-gap: 5px;
}
.button-27 {
  appearance: none;
  background-color: #000000;
  border: 2px solid #1a1a1a;
  border-radius: 15px;
  box-sizing: border-box;
  color: #ffffff;
  cursor: pointer;
  display: inline-block;
  font-family: Roobert, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica,
    Arial, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
  font-size: 16px;
  font-weight: 600;
  line-height: normal;
  margin: 0;
  min-height: 30px;
  min-width: 0;
  outline: none;
  padding: 5px 10px;
  text-align: center;
  text-decoration: none;
  transition: all 300ms cubic-bezier(0.23, 1, 0.32, 1);
  user-select: none;
  -webkit-user-select: none;
  touch-action: manipulation;

  will-change: transform;
}

.button-27:disabled {
  pointer-events: none;
}

.button-27:hover {
  box-shadow: rgba(0, 0, 0, 0.25) 0 8px 15px;
  transform: translateY(-2px);
}

.button-27:active {
  box-shadow: none;
  transform: translateY(0);
}
table {
  padding: 1.5em;
  border-collapse: collapse;
  width: 90%;
  margin: 0 auto;
}
thead {
  color: white;
  border-bottom: 2px solid rgb(221, 217, 217);
  height: 100px;
  background-color: black;
}
th,
td {
  padding: 1em;
  font-size: 1.05em;
  font-weight: 700;
}
tbody > tr:nth-child(even) {
  background-color: #dddddd;
}
tbody > tr:nth-child(odd) {
  background-color: #edeef1;
}
.delete-icon {
  cursor: pointer;
}
</style>
