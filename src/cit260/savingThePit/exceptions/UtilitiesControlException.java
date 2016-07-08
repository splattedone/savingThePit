/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.exceptions;

/**
 *
 * @author bethanyellis
 */
public class UtilitiesControlException extends Exception {
    
    public UtilitiesControlException() {
    }

    public UtilitiesControlException(String message) {
        super(message);
    }

    public UtilitiesControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public UtilitiesControlException(Throwable cause) {
        super(cause);
    }

    public UtilitiesControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
