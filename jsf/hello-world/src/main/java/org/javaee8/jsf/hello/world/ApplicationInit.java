/** Copyright Payara Services Limited **/
package org.javaee8.jsf.hello.world;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.FacesConfig;

/**
 * This class is needed to activate JSF and configure it to be the
 * right version. Without this being present an explicit mapping
 * of the FacesServlet in web.xml would be required, but JSF 2.3
 * would then run in a JSF 2.2 compatibility mode.
 *
 * @author Arjan Tijms
 */
@FacesConfig
@ApplicationScoped
public class ApplicationInit {

}
