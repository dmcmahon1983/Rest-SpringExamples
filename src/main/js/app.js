const React = require('react'); (1)
const ReactDOM = require('react-dom'); (2)
const client = require('./client'); (3)

class App extends React.Component { (1)

	constructor(props) {
		super(props);
		this.state = {surgeons: []};
	}

	componentDidMount() { (2)
		client({method: 'GET', path: '/api/surgeons'}).done(response => {
			this.setState({surgeons: response.entity._embedded.surgeons});
		});
	}

	render() { (3)
		return (
			<EmployeeList employees={this.state.surgeons}/>
		)
	}
}

class SurgeonList extends React.Component{
	render() {
		const surgeons = this.props.surgeons.map(surgeon =>
			<Surgeon key={surgeon._links.self.href} surgeon={surgeons}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Day Of Surgery</th>
						<th>Morning Session</th>
						<th>Afternoon Session</th>
						<th>Full day</th>
						<th>Equipment Code</th>
						<th>Surgery Type</th>
						<th>Aneasthetist Name</th>
						<th>TodaysDate</th>
						<th>Team Member1</th>
						<th>Team Member2</th>
						<th>Team Member3</th>
						<th>Team Member4</th>
						<th>Team Member5</th>
						<th>Team Member6</th>
						<th>TheatreNumber</th>
					</tr>
					{surgeons}
				</tbody>
			</table>
		)
	}
}

class Surgeon extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.surgeon.firstName}</td>
				<td>{this.props.surgeon.lastName}</td>
				<td>{this.props.surgeon.dayOfSurgery}</td>
				<td>{this.props.surgeon.morningSession}</td>
				<td>{this.props.surgeon.afternoonSession}</td>
				<td>{this.props.surgeon.fullDay}</td>
				<td>{this.props.surgeon.equipmentCode}</td>
				<td>{this.props.surgeon.surgeryType}</td>
				<td>{this.props.surgeon.aneasthetist}</td>
				<td>{this.props.surgeon.todaysDate}</td>
				<td>{this.props.surgeon.teamMember1}</td>
				<td>{this.props.surgeon.teamMember2}</td>
				<td>{this.props.surgeon.teamMember3}</td>
				<td>{this.props.surgeon.teamMember4}</td>
				<td>{this.props.surgeon.teamMember5}</td>
				<td>{this.props.surgeon.teamMember6}</td>
				<td>{this.props.surgeon.theatreNumber}</td>
			</tr>
		)
	}
}
// end::employee[]

// tag::render[]
ReactDOM.render(
	<App />,
	document.getElementById('react')
)


