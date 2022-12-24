import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddCustomersComponent } from './Components/add-customers/add-customers.component';
import { ClientesComponent } from './Components/clientes/clientes.component';

const routes: Routes = [
  {path: '', component: ClientesComponent},
  {path: 'add', component: AddCustomersComponent},
  {path: '**', redirectTo: '', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
