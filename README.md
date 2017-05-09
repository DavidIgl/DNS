# dns-java-ro3-62


David Iglesias Salgado


Ignacia Diaz Rey 


Mejoras:


1.Implementación del mecanismo de caché (la caché no debe guardarse, es decir, al inicio de cada invocación al programa dnsclient, la caché estará vacía)


2.Soporte para la resolución de consultas tipo AAAA desde la entrada estándar


3.Soporte para el escenario básico del punto 4, es decir, cuando se obtiene una respuesta que contiene servidores DNS autorizados (registros RR en la sección AUTHORITY) pero no se incluyen los correspondientes registros tipo A para dichos servidores en la sección ADDITIONAL, con lo que son necesarias consultas adicionales para obtener el registro A que permita seguir con las consultas iterativas 


dns-java-ro3-62 created by GitHub Classroom
