/**
 */
package my.webpage.model.defaultname;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Webpage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link my.webpage.model.defaultname.Webpage#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see my.webpage.model.defaultname.DefaultnamePackage#getWebpage()
 * @model
 * @generated
 */
public interface Webpage extends EObject {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link my.webpage.model.defaultname.Web}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see my.webpage.model.defaultname.DefaultnamePackage#getWebpage_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Web> getPages();

} // Webpage
