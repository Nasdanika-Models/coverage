/**
 */
package org.nasdanika.models.coverage;

import org.eclipse.emf.common.util.EList;
import org.jacoco.core.analysis.ISourceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.coverage.SourceCoverage#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.coverage.CoveragePackage#getSourceCoverage()
 * @model
 * @generated
 */
public interface SourceCoverage extends Coverage {
	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.coverage.Line}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see org.nasdanika.models.coverage.CoveragePackage#getSourceCoverage_Lines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Line> getLines();

	default void load(ISourceNode data) {
		Coverage.super.load(data);
		EList<Line> lines = getLines();
		for (int i = data.getFirstLine(); i <= data.getLastLine(); ++i) {
			lines.add(Line.load(data.getLine(i), i));
		}
	}

} // SourceCoverage
