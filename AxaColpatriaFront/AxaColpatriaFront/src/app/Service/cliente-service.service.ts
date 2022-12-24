import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { ClienteModel } from '../Model/cliente-model';

@Injectable({
  providedIn: 'root'
})
export class ClienteServiceService {

  private getUrl:string ="http://localhost:8095/customers/";
  //private getUrl:string ="https://8e7c6b8a-fc46-4674-a529-4ebec57295d3.mock.pstmn.io/customers";

  constructor(private httpClient: HttpClient) { }


  public lista(): Observable<ClienteModel[]> {
    return this.httpClient.get<ClienteModel[]>(this.getUrl + 'getCustomers');
  }

  public save(customer: ClienteModel): Observable<any> {
    return this.httpClient.post<any>(this.getUrl + 'customers', customer);
  }


}
