import { Component, OnInit } from '@angular/core';
import { ActivatedRoute,Router } from '@angular/router';

import { Employee } from '../employee';
import { EmployeeComponent } from '../employee/employee.component';
import { EmployeeService } from '../employee.service';


@Component({
  selector: 'app-update-employe',
  templateUrl: './update-employe.component.html',
  styleUrls: ['./update-employe.component.css']
})
export class UpdateEmployeComponent implements OnInit {
  employee!:Employee;
  
  constructor(private employeeservice:EmployeeService,private route:ActivatedRoute,private router:Router) { }

  ngOnInit(): void {
    let id=this.route.snapshot.params.id;
    console.log(id);
    this.employeeservice.getEmployeesById(id).subscribe((data)=>{
      this.employee=data;
    });

  }
  onSubmit(employee:Employee)
  {
    this.employeeservice.updateEmployee(employee).subscribe(data=>{
      this.router.navigate(["/employees"]);
    })
  }
  onCancel(){
    this.router.navigate(["/employees"])
  }

}
