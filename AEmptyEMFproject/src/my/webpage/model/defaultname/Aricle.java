/**
 */
package my.webpage.model.defaultname;

import java.util.Calendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aricle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link my.webpage.model.defaultname.Aricle#getName <em>Name</em>}</li>
 *   <li>{@link my.webpage.model.defaultname.Aricle#getCreated <em>Created</em>}</li>
 * </ul>
 * </p>
 *
 * @see my.webpage.model.defaultname.DefaultnamePackage#getAricle()
 * @model
 * @generated
 */
public interface Aricle extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see my.webpage.model.defaultname.DefaultnamePackage#getAricle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link my.webpage.model.defaultname.Aricle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Calendar)
	 * @see my.webpage.model.defaultname.DefaultnamePackage#getAricle_Created()
	 * @model dataType="my.webpage.model.defaultname.celendar"
	 * @generated
	 */
	Calendar getCreated();

	/**
	 * Sets the value of the '{@link my.webpage.model.defaultname.Aricle#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Calendar value);

} // Aricle
