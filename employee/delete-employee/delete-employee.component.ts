import { Component, OnInit } from '@angular/core';
import { Router,ActivatedRoute } from '@angular/router';

import { Employee } from '../employee';
import { EmployeeComponent } from '../employee/employee.component';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-delete-employee',
  templateUrl: './delete-employee.component.html',
  styleUrls: ['./delete-employee.component.css']
})
export class DeleteEmployeeComponent implements OnInit {
  employee!: Employee;
  constructor(private employeeService: EmployeeService, private route: ActivatedRoute, private router: Router) { }

  

  ngOnInit(): void {
    let id = this.route.snapshot.params.id;
     this.employeeService.getEmployeesById(id).subscribe(data => {
       this.employee = data;
  });
     
}
onDelete(){
  this.employeeService.deleteEmployee(this.employee.id).subscribe(data=>{
    this.router.navigate(["/employees"]);
  }); 
}
onCancel(){
  this.router.navigate(["/employees"])
}
}
