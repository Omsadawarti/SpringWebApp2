package org.nlt.services;

import org.nlt.controller.ParentController;
import org.springframework.stereotype.Service;

@Service
public class StateServices extends ParentController {

	public StateServices() {
		System.out.println("State Services Object Created");
	}

}
