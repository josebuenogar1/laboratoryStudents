

  //label fields for database
  var hour_labels=[{"seven_am":"7"},{"eight_am":"8"},{"nine_am":"9"},{"ten_am":"10"},{"eleven_am":"11"}
                   ,{"twelve_am":"12"},{"one_pm":"13"},{"two_pm":"14"},{"three_pm":"15"},{"four_pm":"16"}
                   ,{"five_pm":"17"}, {"six_pm":"18"},{"seven_pm":"19"},{"eight_pm":"20"},{"nine_pm":"21"}]

  var table = document.getElementById("hours_table");

  //insert date_id on the table from database
  date_row(table)

  //insert hours on the table from database
  hour_labels.forEach(e=>hour_row(e,table));


  function date_row(table){
  var row_date = table.insertRow();
  hours.forEach((e,i)=>{
    row_date.insertCell(i).innerHTML = e.date_id;
  })
  }

  // insert hour if it is available.
  function hour_row(elem,table){
        var k = Object.keys(elem)
        var label=k[0]
        var hour_number=elem[label]
        var row = table.insertRow();

        hours.forEach((e,i)=>{
              if ( e[label] ){
                 row.insertCell(i).innerHTML = `<a href="/register/${window.location.pathname}/${e.date_id}/${hour_number}">${hour_number + ":00"}`;
              } else{
                 row.insertCell(i).innerHTML = "Unavailable";
              }
        })
    }
