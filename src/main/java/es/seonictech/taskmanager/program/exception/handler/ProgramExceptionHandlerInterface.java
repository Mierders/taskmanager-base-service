package es.seonictech.taskmanager.program.exception.handler;

import es.seonictech.taskmanager.program.out.ErrorResponse;

public interface ProgramExceptionHandlerInterface {

	public boolean support(Throwable exception);
	
	public int getPriority();
	
	public ErrorResponse manage(Throwable exception);
}
