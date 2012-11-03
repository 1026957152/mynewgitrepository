/**
 */
package my.webpage.model.defaultname;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link my.webpage.model.defaultname.Web#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link my.webpage.model.defaultname.Web#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see my.webpage.model.defaultname.DefaultnamePackage#getWeb()
 * @model
 * @generated
 */
public interface Web extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(Web)
	 * @see my.webpage.model.defaultname.DefaultnamePackage#getWeb_EReference0()
	 * @model
	 * @generated
	 */
	Web getEReference0();

	/**
	 * Sets the value of the '{@link my.webpage.model.defaultname.Web#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(Web value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference.
	 * @see #setCategories(Category)
	 * @see my.webpage.model.defaultname.DefaultnamePackage#getWeb_Categories()
	 * @model containment="true"
	 * @generated
	 */
	Category getCategories();

	/**
	 * Sets the value of the '{@link my.webpage.model.defaultname.Web#getCategories <em>Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categories</em>' containment reference.
	 * @see #getCategories()
	 * @generated
	 */
	void setCategories(Category value);

} // Web
