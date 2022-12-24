import { Component, OnInit } from '@angular/core';
import { ClienteModel } from 'src/app/Model/cliente-model';
import { ClienteServiceService } from 'src/app/Service/cliente-service.service';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})
export class ClientesComponent implements OnInit {
[x: string]: any;

  clientes: any[] = [];


  constructor(private _clienteService: ClienteServiceService) { }

  ngOnInit(): void {
    this.obtenerClientes();
  }

  obtenerClientes(){
    this._clienteService.lista().subscribe(
      data => this.clientes = data
    );
  }


}
