/**
 * Author:Eda Akyıl
 * User:edaakyil
 * Date:27.02.2025
 * Time:11:00
 */

package com.edaakyil.java.data.exception.repository;

public class RepositoryException extends RuntimeException {
    public RepositoryException()
    {
        this(null);
    }

    public RepositoryException(String message)
    {
        this(message, null);
    }

    public RepositoryException(String message, Throwable cause)
    {
        super(message, cause);
    }

    @Override
    public String getMessage()
    {
        var cause = getCause();

        return String.format("Message: %s%s", super.getMessage(), cause != null ? ", Cause Message: " + cause.getMessage() : "");
    }
}
