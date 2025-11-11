import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { References } from './references';
import { Observable, tap, catchError, of } from 'rxjs';

//Indica que el servicio se puede injectar en cualquier parte de la aplicación
@Injectable({
  providedIn: 'root'
})
export class ReferencesService {

  private referencesUrl = 'http://localhost:8080/sqlfactory/api/referencies';

  constructor(private http : HttpClient) { 
  }
  //Método para obtener referencias
  getReferences():Observable<References[]> {
    return this.http.get<References[]>(this.referencesUrl).pipe(
      tap(data => console.log('Datos recibidos:', data)),
      catchError(error => {
        console.error('Error al obtener las referencias:', error);
        return of([]); // Devuelve un array vacío para que la aplicación no se rompa.
      })
    );
  }
}