import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { ReferencesService } from './references.service';
import { References } from './references';

@Component({
  selector: 'app-primaria',
  standalone: true,
  imports: [RouterOutlet, CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  title = 'FrontMaestro';
  references: References[] = [];
  loading: boolean = true;
  error: string = '';

  constructor(private referencesService: ReferencesService) {}

  ngOnInit(): void {
    this.loadReferences();
  }

  /**
   * Loads references from the service and updates the component state.
   * 
   * This method subscribes to the references service to fetch all available references.
   * It handles both successful data retrieval and error scenarios, updating the loading
   * state and storing the results or error messages accordingly.
   * 
   * @returns {void} This method does not return a value.
   */
  loadReferences(): void {
    this.referencesService.getReferences().subscribe({
      next: (data) => {
        this.references = data;
        this.loading = false;
        console.log('Referencias cargadas:', this.references);
      },
      error: (err) => {
        this.error = 'Error al cargar las referencias';
        this.loading = false;
        console.error('Error:', err);
      }
    });
  }
}