# Servlet Scopes

Servlets have a variety of scopes available to them. These scopes 
determine how data is persisted throughout the lifecycle of the application
and other various processes associated with a web application.

1) Request scope - All data attached to the request object. This data is
available for the lifetime of the request.

2) Session scope - Session scope data is attached to a client session and
is available for any request which identifies itself as that client. This
can be used to maintain state between requests from a given client. In
the background, this just uses cookies and maintains stateful information
on the server. Note: Using session scope is a violation of RESTful 
architecture's core principles.

3) Servlet scope - Data attached to a given servlet. Available for the
lifetime of the servlet.  Data is often used to provide configuration
information to the servlet when it starts up.

4) Application scope - Data attached to the entire application. Is accessible
from any servlet. This data is available for the lifetime of the application.
