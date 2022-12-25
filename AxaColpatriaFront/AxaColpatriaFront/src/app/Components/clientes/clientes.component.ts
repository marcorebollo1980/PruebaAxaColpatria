import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
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


  constructor(private _clienteService: ClienteServiceService,private router: Router) { }

  ngOnInit(): void {
    this.obtenerClientes();
  }

  obtenerClientes(){
    this._clienteService.lista().subscribe(
      data => this.clientes = data
    );
  }

  public add(){
    this.router.navigate(['add']);
  }

}
