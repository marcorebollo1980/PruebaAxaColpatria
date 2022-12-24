import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ClienteModel } from 'src/app/Model/cliente-model';
import { ClienteServiceService } from 'src/app/Service/cliente-service.service';

@Component({
  selector: 'app-add-customers',
  templateUrl: './add-customers.component.html',
  styleUrls: ['./add-customers.component.css']
})
export class AddCustomersComponent implements OnInit {

      name = '';
      age = '';
      phoneNumber = '';
      address = '';

      customers:any;
      customerForm:any;
      CustomerName: any;
      CustomerAge: any;
      CustomerTelephoneNumber: any;
      CustomerAddres: any;
      this: any;
      studentsaveform: any;

  constructor( private customersService: ClienteServiceService) { }

  customer : ClienteModel = new ClienteModel();
  submitted = false;

  ngOnInit() {
  }

  onCreate(): void {
    const producto = new ClienteModel();
    this.customersService.save(producto).subscribe(
      data => console.log(data),
      error => console.log(error)
    );
  }



}
