import React, { Component } from "react";

class Getuser extends Component {
  constructor(props) {
    super(props);
    this.state = {
      loading: true,
      person: null,
    };
  }

  async componentDidMount() {
    const url = "https://api.randomuser.me/";
    const response = await fetch(url);
    const data = await response.json();
    this.setState({ person: data.results[0], loading: false });
    console.log(data.results[0]);
  }

  render() {
    if (this.state.loading) {
      return <h2>Loading...</h2>;
    }

    if (!this.state.person) {
      return <h2>No user data found</h2>;
    }

    return (
      <div style={{ marginTop: "20px" }}>
        <h2>
          {this.state.person.name.title} {this.state.person.name.first}{" "}
          {this.state.person.name.last}
        </h2>
        <img
          src={this.state.person.picture.large}
          alt="User"
          style={{ borderRadius: "50%", marginTop: "10px" }}
        />
      </div>
    );
  }
}

export default Getuser;
