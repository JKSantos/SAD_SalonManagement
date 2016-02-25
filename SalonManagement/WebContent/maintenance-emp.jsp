<!DOCTYPE html>
<html ng-app>
  <head>
  <link rel="stylesheet" href="./css/materialize.min.css"  media="screen,projection"/>
  <link type="text/css" rel="stylesheet" href="./css/materialize.css"/>
  <link type="text/css" rel="stylesheet" href="./css/mystyle.css"/>
  <link type="text/css" rel="stylesheet" href="./css/mtnc-emp.css"
    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  </head>

  <body class="blue-grey lighten-5">
  <div class="wrapper">
            <header class="headnav">
                <ul id="slide-out" class="side-nav fixed z-depth-0">
                  <div class="center">
                      <img src="./img/anon.jpg" class="circle" style="width: 150px; height: 150px; margin-top: 40px; margin-bottom: 20px;">
                    </div>
                  <li><a href="admin-home.jsp" class="waves-effect waves-orange"><b>Home</b></a></li>
                 <!--  <li class="no-padding"> -->
                    <ul class="collapsible" data-collapsible="accordion">
                      <li>
                        <a class="collapsible-header"><b>Maintenance</b></a>
                          <div class="collapsible-body">
                            <ul>
                              <li class="orange"><a href="maintenance-emp.jsp">Employee</a></li>
                              <li><a href="maintenance-prodsvc.jsp">Product & Service</a></li>
                              <li><a href="maintenance-promdisc.jsp">Promo</a></li>
                              <li><a href="maintenance-package.jsp">Discount</a></li>
                            </ul>
                          </div>
                      </li>
                      <li>
                        <a class="collapsible-header"><b>Transaction</b></a>
                          <div class="collapsible-body">
                            <ul>
                              <li><a href="transactions-reservation.jsp">Reservation</a></li>
                              <li><a href="transactions-productorder.jsp">Product Order</a></li>
                              <li><a href="#!">Walk-In</a></li>
                            </ul>
                          </div>
                      </li>
                    </ul>
                  <li><a href="utilities.jsp" class="waves-effect waves-orange"><b>Utilities</b></a></li>
                </ul>

        
               <nav class="z-depth-0">
                 <div class="nav-wrapper orange">
                   <a href="#!" class="brand-logo white-text" style="margin-left: 30px;">Salon Management System</a>
                 
                   <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
                   <ul class="side-nav" id="mobile-demo">
                     <li><a href="admin-home.jsp" class="waves-effect waves-orange"><b>Home</b></a>
                       <ul class="collapsible collapsible-accordion">
                         <li>
                           <a class="waves-effect waves-orange collapsible-header"><b>Maintenance</b></a>
                             <div class="collapsible-body">
                               <ul>
                                 <li class="orange"><a href="maintenance-emp.jsp">Employee</a></li>
                                 <li><a href="maintenance-prodsvc.jsp">Product & Service</a></li>
                                 <li><a href="maintenance-promdisc.jsp">Promo</a></li>
                                 <li><a href="maintenance-package.jsp">Discount</a></li>
                               </ul>
                             </div>
                         </li>
                         <li>
                           <a class="waves-effect waves-orange collapsible-header"><b>Transaction</b></a>
                             <div class="collapsible-body">
                               <ul>
                                 <li><a href="transactions-reservation.jsp">Reservation</a></li>
                                 <li><a href="transactions-productorder.jsp">Product Order</a></li>
                                 <li><a href="#!">Walk-In</a></li>
                               </ul>
                             </div>
                         </li>
                       </ul>
                    <li><a href="utilities.jsp" class="waves-effect waves-orange"><b>Utilities</b></a></li>
                   </ul>
                 </div>
               </nav>
        </header>

        <article>
          <div class="wrapper">
                    <div class="aside aside1 z-depth-barts">
                      <header><h4>Create Employee</h4><div class="divider"></div></header>

                      <div class="row">
                          <form class="col s12" action="" onsubmit="return passvalidation()">
                              <div class="row">
                                  <div class="input-field col s4">
                                      <label class="red-text">(*) Indicates required field</label>
                                  </div>
                                  <div class="input-field col s6 offset-s2">
                                      <img  id="employeeimg" style="width: 120px; height: 120px;" src="./img/anon.jpg" alt=""/>
                                  </div>
                                  <div class="input-field col s4">
                                      <input id="empid" type="text" disabled="disabled">
                                      <label for="empid">Employee ID</label>
                                  </div>
                                  <div class="input-field col s7 offset-s1">
                                      <div class="file-field">
                                            <div class="btn orange">
                                              <span class="">Image</span>
                                              <input type="file" accept="image/*" onchange="loadFile(event)">
                                            </div>
                                            <div class="file-path-wrapper">
                                              <input class="file-path validate" type="text">
                                            </div>
                                        </div>
                                  </div>
                                  <div class="input-field col s4">
                                      <input id="fname" type="text" class="validate active" required>
                                      <label for="fname">First Name<span class="red-text">*</span></label>
                                  </div>
                                  <div class="input-field col s4">
                                      <input id="mname" type="text" class="validate">
                                      <label for="mname">Middle Name</label>
                                  </div>
                                  <div class="input-field col s4">
                                      <input id="lname" type="text" class="validate" required>
                                      <label for="lname">Last Name<span class="red-text">*</span></label>
                                  </div>
                                      <div class="input-field col s8">
                                        <input type="date" class="datepicker">
                                      </div>
                                      <div class="input-field col s4">
                                          <input type="text" class="validate" disabled value="">
                                          <label style="color: #9e9e9e;">Age: <span id="age"></span></label>
                                          
                                      </div>
                                  <div class="input-field col s6" >
                                      <select required>
                                        <option value="" disabled selected></option>
                                        <option value="1">Male</option>
                                        <option value="2">Female</option>
                                      </select>
                                      <label>Gender <span class="red-text">*</span></label>
                                  </div>
                                  <div class="input-field col s1">
                                    <p style="margin-top: 12px; margin-left: -7px;">(+63)</p>
                                  </div>
                                  <div class="input-field col s5">
                                      <input type="text" id="contact" class="validate" maxlength="10">
                                      <label for="contact">Contact Number</label>
                                  </div>
                                  <div class="input-field col s12">
                                      <input type="text" id="address" class="validate">
                                      <label for="address">Address <span class="red-text">*</span></label>
                                  </div>
                                  <div class="input-field col s12">
                                      <p style="color:#9e9e9e;font-size:12px;">Position <span class="red-text">*</span></p>
                                  </div>
                                  <div class="input-field col s5" style="margin-top: -1px;">
                                      <select class="browser-default" id="slct1" name="slct1">
                                          <option value="" disabled selected> </option>
                                      </select>
                                  </div>
                                  <div class="input-field col s2" style="margin-top: -0.2px;">
                                      <p style="margin-top: 5px;" class="center"><a id="optionadd" class="waves-effect waves-light orange-btn"><i class="material-icons small">add</i></a><a class="waves-effect waves-light orange-btn" onclick="removeopt()"><i class="material-icons small">remove</i></a></p>
                                  </div>
                                  <div class="input-field col s4" style="margin-top: -4px;">
                                      <input type="text" id="add-optname" class="validate">
                                      <label for="add-optname">Another position</label>
                                  </div>
                                  <div class="divider col s12" style="margin-top: 20px;"></div>
                                  <div class="col s12"  style="margin-top: 10px;">
                                      <h4>Account</h4>
                                  </div>
                                  <div class="input-field col s6 offset-s3">
                                      <input type="text" class="validate" id="user" maxlength="15">
                                      <label for="user">Username</label>
                                  </div>
                                  <div class="input-field col s6 offset-s3">
                                      <input type="password" class="validate" id="pass" maxlength="20" onkeyup="checkPass(); return false;">
                                      <label for="pass">Password <span id="pw1"></span></label>
                                  </div>
                                  <div class="input-field col s6 offset-s3">
                                      <input type="password" class="validate" id="conf-pass" maxlength="20" onkeyup="checkPass(); return false;">
                                      <label for="conf-pass">Confirm Password <span id="pw2"></span></label>
                                  </div>
                                  <div class="input-field col s6 offset-s3">
                                      <span id="confirmMsg" class="confirmMsg"></span>
                                  </div>

                                  <div class="input-field col s12"> 
                                      <button class="waves-effect waves-white btn-flat orange" title="Create" type="submit" value="Submit" id="savebtn" disabled="disabled" onclick="success()">Next</button>
                                      <button class="waves-effect waves-orange btn-flat white" type="reset" value="Reset" title="Clear">CLEAR</button>
                                  </div>
                              </div>

                              <!-- ADD OPTION POSITION -->
                                

                          </form>
                      </div>
                    </div>


                    <div class="aside aside2 z-depth-barts">
                                    <nav class="z-depth-0">
                                      <div class="nav-wrapper grey lighten-3 grey-text text-darken-4">
                                        <form>
                                          <div class="input-field col s12 z-depth-0">
                                            <input class="grey lighten-1" id="search" type="search" ng-model="name">
                                            <label for="search"><i class="material-icons grey-text text-darken-3">search</i></label>
                                          </div>
                                        </form>
                                      </div>
                                    </nav>
                     <div class="row">
                         <div class="col s12">
                             <div class="row">
                                    <h5>Employee List</h5>
                                        <!-- <li ng-repeat="employee in emp | filter: name | orderBy: 'lastname'">
                                          <div class="collapsible-header">
                                              {{employee.name}} {{employee.lastname}}
                                          </div>
                                          <div class="collapsible-body blue-grey lighten-5"><a href="#modaledit" class="modal-trigger waves-effect waves-orange btn-flat">Update</a>
                                          <a  class="waves-effect waves-orange btn-flat red-text">Deactivate</a></div>
                                        </li> -->
                                        <!-- <li>
                                          <div class="collapsible-header">
                                              <img src="./img/barts.jpg" style="width: 30px;height: 30px; margin-top: 6px;" class="circle left"/>
                                              John Angelo C. Barot
                                          </div>
                                          <div class="collapsible-body blue-grey lighten-5">
                                          <a class="waves-effect waves-orange btn-flat">Edit</a>
                                          <a class="waves-effect waves-orange btn-flat red-text">Delete</a></div>
                                        </li>
                                        <li>
                                          <div class="collapsible-header">
                                              <img src="./img/joshua.jpg" style="width: 30px;height: 30px; margin-top: 6px;" class="circle left"/>
                                              Joshua N. Mercado
                                          </div> -->
                                      </ul>
                                      <table class="stripped">
                                              <thead>
                                                <tr>
                                                    <th data-field="id">Name</th>
                                                    <th data-field="name">Position</th>
                                                    <th data-field="price">Action</th>
                                                </tr>
                                              </thead>

                                              <tbody ng-init="emp=[{name:'Han Ainan',lastname:'Ongsip'},{name:'John Angelo',lastname:'Barot'},{name:'Joshua',lastname:'Mercado'}]">
                                                <tr ng-repeat="employee in emp | filter: name | orderBy: 'name'">
                                                  <td>{{employee.name}} {{employee.lastname}}</td>
                                                  <td></td>
                                                  <td>$0.87</td>
                                                </tr>
                                              </tbody>
                                      </table>

                                      <div id="modaledit" class="modal modal-fixed-footer">
                                          <div class="modal-content">
                                            <h4>Update Employee</h4>
                                            <div class="row">
                                              <form class="col s12" action="">
                                                  <div class="row">
                                                      <div class="input-field col s5 offset-s7">
                                                          <img  id="output2" style="width: 120px; height: 120px;" src="./img/ainan.jpg" alt=""/>
                                                      </div>
                                                      <div class="input-field col s4">
                                                          <input type="text" id="en" validate disabled="disabled">
                                                          <label for="en">Employee Number</label>
                                                      </div>
                                                      <div class="input-field col s5 offset-s3">
                                                          <div class="file-field">
                                                                <div class="btn orange">
                                                                  <span class="">Image</span>
                                                                  <input type="file" accept="image/*" onchange="editFile(event)">
                                                                </div>
                                                                <div class="file-path-wrapper">
                                                                  <input class="file-path validate" type="text">
                                                                </div>
                                                            </div>
                                                      </div>
                                                      <div class="input-field col s12">
                                                          <input type="text" id="fn" validate disabled="disabled">
                                                          <label for="fn">First Name</label>
                                                      </div>
                                                  </div>
                                              </form>
                                            </div>


                                          </div>
                                          <div class="modal-footer">
                                            <a href="#!" class="modal-action modal-close waves-effect waves-orange btn-flat">Cancel</a>
                                            <button type="submit" value="Submit" class="modal-action waves-effect waves-light orange btn-flat ">Confirm</button>
                                          </div>
                                        </div>

                                </div>
                            </div>
                        </div>
                    </div>
          </div>
        </article>

        

  </div>

  <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="./js/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="./js/materialize.min.js"></script>
    <script type="text/javascript" src="./js/angular.min.js"></script>
    
    <script type="text/javascript">
      $( document ).ready(function(){
        $(".button-collapse").sideNav();
          // Initialize collapsible (uncomment the line below if you use the dropdown variation)
        $('.collapsible').collapsible();
      });
    </script>
    <!-- bday -->
    <script type="text/javascript">
        $('.datepicker').pickadate({
          selectMonths: true, // Creates a dropdown to control month
          selectYears: 15 // Creates a dropdown of 15 years to control year
        });
    </script>

    <!-- Upload image -->

    <script text="text/javascript">
      var loadFile = function(event) {
        var employeeimg = document.getElementById('employeeimg');
        employeeimg.src = URL.createObjectURL(event.target.files[0]);
      };
    </script>

    <script text="text/javascript">
      var loadFile = editFile(event) {
        var output2 = document.getElementById('output2');
        output2.src = URL.createObjectURL(event.target.files[0]);
      };
    </script>

    

    <script>
      $(document).ready(function() {
          $('select').material_select();
        });
      </script>

    <!--- Modal -->

    <script type="text/javascript">
        $(document).ready(function(){
            // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
            $('.modal-trigger').leanModal();
          }); 
    </script>

    <script type="text/javascript">
          function checkPass(){
            var pass1 = document.getElementById('password').value;
            var pass2 = document.getElementById('conf-password').value;
            var good = "#66cc66";
            var bad = "#ff6666";

            if(pass1 == pass2 && pass2 == pass1 && pass1 != null && pass2 != null) {
              document.getElementById('confirmMsg').style.color = good;
              document.getElementById('confirmMsg').innerHTML = "Password Match!";
              document.getElementById('savebtn').disabled = false;
            }else{
              document.getElementById('confirmMsg').style.color = bad;
              document.getElementById('confirmMsg').style.color = bad;
              document.getElementById('confirmMsg').innerHTML = "Password Do Not Match!";
              document.getElementById('savebtn').disabled = true;
            }
          }
    </script>

    <!-- add option -->
    

    <script>
           $(document).ready(function(){
              $("#optionadd").click(function(){
                 var addopt = $("#add-optname").val();
                 if(jQuery.trim(addopt).length > 0){
                      var o = new Option(addopt, addopt, true);
                      /// jquerify the DOM object 'o' so we can use the html method
                      $(o).html(addopt);
                      $("#slct1").append(o);
                 }else{
                  $("<div title='Error!'>Empty</div>").dialog();
                 }
                   
                   });
                  
                });
    </script>
   
   <script type="text/javascript">
      function removeopt(){
        var x = document.getElementById("slct1");
        var y = document.getElementById("slct2");

        x.remove(x.selectedIndex);
        y.remove(y.selectedIndex);
      }
   </script>

   <script type="text/javascript">
   var month = document.getElementById('month').value;
   var day = document.getElementById('day').value;
   var year = document.getElementById('year').value;

   var curday = new Date();
   var mm = curday.getMonth()+1;
   var dd = curday.getDate();
   var yyyy = curday.getFullYear();

   var bday = month+'/'+day+'/'+year;
   var today = mm+'/'+dd+'/'+yyyy;
   
   if(day<32 && month!='' || day!='' || year!=''){
         if(month<=mm && day<=dd && year<=yyyy && day!='' && year>0){
               var myage = yyyy - year;
               document.getElementById('age').innerHTML = myage;
               document.getElementById('age').style.color = "black";
         } else if(month>=mm && day>dd && year<yyyy && year>0){
           var myage = yyyy-year;
           document.getElementById('age').innerHTML = myage-1;
           document.getElementById('age').style.color = "black";
         } else if(month>=mm && day<dd && year<yyyy && year>0){
           var myage = yyyy-year;
           document.getElementById('age').innerHTML = myage-1;
           document.getElementById('age').style.color = "black";
         }else if(year=='' || day=='' || month==''){
           document.getElementById('age').innerHTML = " ";
         }else if(year>yyyy){
           document.getElementById('age').innerHTML = "dpa buhay";
           document.getElementById('age').style.color = "red";
         }
     }
    else{
         document.getElementById('age').innerHTML = "";
    }
   </script>

   <script type="text/javascript">
         function checkPass(){
           var pass1 = document.getElementById('pass').value;
           var pass2 = document.getElementById('conf-pass').value;
           var good = "#66cc66";
           var bad = "#ff6666";

           if(pass1 == pass2 && pass2 == pass1 && pass1 != "" && pass2 != "") {
             document.getElementById('confirmMsg').style.color = good;
             document.getElementById('confirmMsg').innerHTML = "Password Match!";
             document.getElementById('savebtn').disabled = false;
           }else{
             document.getElementById('confirmMsg').style.color = bad;
             document.getElementById('confirmMsg').style.color = bad;
             document.getElementById('confirmMsg').innerHTML = "Password Do Not Match!";
             document.getElementById('savebtn').disabled = true;
           }
         }
   </script>

   <script type="text/javascript">
      function success(){
        alert("Successfully Created");
      }
   </script>

  </body>

</html>