import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee'
@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employees:any;



  constructor(private employeeservice:EmployeeService,private router:Router) { }

  ngOnInit(): void {
    this.employeeservice.getEmployees().subscribe(data=>this.employees=data);
  }
onClick(){
  this.router.navigate(["/add"]);
}
}
