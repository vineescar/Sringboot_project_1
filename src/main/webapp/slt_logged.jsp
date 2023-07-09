<!DOCTYPE html>
<html>
<head>
  <title>Welcome to MySLT Selfcare</title>
  <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
  <style>
  body {
  background-image: url("image/SLT4.png");
  background-repeat: no-repeat;
  background-size: cover;
}
    #container {
      display: flex;
      justify-content: center;
      align-items: center;
      height: 15vh;
      font-size:18px;
    }
  
    #banner {
      font-size:18px;
      margin-top: 100px;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 20vh;
      color: black;
	   margin-bottom:100px;
    }

    #pieChart {
    width: 2200px !important;
    height: 300px !important;
  }
  </style>
</head>
<body>
  <div id="container">
    <img src="image/SLT3.png" /><br>
  </div>

  <div id="banner">
    <canvas id="pieChart"></canvas>

  <script>
    // Sample data for the pie chart
    const data = {
      labels: ['remaining', 'used'],
      values: [${detail.remaining}, ${extraData}],
      colors: ['green', 'purple']
    };

    // Create the pie chart
    const pieChartCanvas = document.getElementById('pieChart');

    new Chart(pieChartCanvas, {
      type: 'pie',
      data: {
        labels: data.labels,
        datasets: [{
          label: 'Pie Chart',
          data: data.values,
          backgroundColor: data.colors,
        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false, // Add this line to disable aspect ratio maintenance
      }
    });
  </script>
  </div>
  
  <div >
   Hello , ${detail.name}<br>
  <h3>Package name :${detail.packname}</h3>
  <h3>Remaining    :${detail.remaining}</h3>
  <h3>Used    :${extraData}</h3>
  <h3>Total payable:${detail.totalpayable}</h3><br>
  <form action="addUser">
  <input type="submit" value="SIGN OUT"><br>
  </form>
  </div>
  
</body>
</html>
