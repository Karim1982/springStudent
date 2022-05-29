import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componnents/header/header.component';
import { FooterComponent } from './componnents/footer/footer.component';
import { LoginComponent } from './componnents/login/login.component';
import { StudentsComponent } from './componnents/students/students.component';
import { OptionsComponent } from './componnents/options/options.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    LoginComponent,
    StudentsComponent,
    OptionsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
