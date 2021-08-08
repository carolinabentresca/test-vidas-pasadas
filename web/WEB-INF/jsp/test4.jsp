<%-- 
    Document   : test4
    Created on : 24/05/2021, 18:58:03
    Author     : EXO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vidas Pasadas</title>
    </head>
    <body style="background: black;color: palevioletred;font-family: monospace;font-size: 150%">
      <center>  
          <form method="POST">
           <br/> 
            <p>
               Quienes creen en la teoría de la reencarnación sostienen que al morir el alma humana no desaparece sino que se une a otro cuerpo y empieza así una nueva vida.
               Esta teoría es mantenida por la tradición del budismo y el hinduismo, por quienes creen en la astrología y por filósofos como Pitágoras y Platón.
               Si esta visión de la vida es cierta, implica que todo hombre o mujer ha vivido con anterioridad otras vidas.
               Preparado para conocer quien fuiste en tu Vida Pasada???
            </p>
            <p style="background: wheat;color: palevioletred">Qué sexo eres??</p>
            <input type="radio" name="sexo" value="mujer" />
            <label for="mujer">MUJER</label><br/>
            <input type="radio" name="sexo" value="hombre" />
            <label for="hombre">HOMBRE</label> <br/>
            <br/>
            <p style="background: wheat;color: palevioletred">Qué edad tienes??</p>
            <input type="radio" name="edad" value="menor o igual 35" />
            <label for="menor o igual 35">MENOR 35</label> <br/>
            <input type="radio" name="edad" value="mayor 35" />
            <label for="mayor 35">MAYOR 35</label><br/>
            <input type="radio" name="edad" value="mayor 60" />
            <label for="mayor 60">MAYOR 60</label><br/>
            <br/>
            <br/>
            <input type="submit" value="Terminar Test" style="background: wheat;color: palevioletred;font-family: monospace;font-size: 120%"/>
        </form>
      </center>
    </body>
</html>
