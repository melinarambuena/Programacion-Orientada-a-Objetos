/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_ej_04_taskmanager;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<String> taskManager = new ArrayList<>();

    public void inicializarAgregar(String e) {
        taskManager.add(e);
    }

    public void eliminar() {
        if (!taskManager.isEmpty()) {
            taskManager.remove(0);
        } else {
            System.out.println("La lista de tareas está vacía.");
        }
    }

    public void recorrer() {
        for (String e : taskManager) {
            System.out.println(e);
        }
    }
}