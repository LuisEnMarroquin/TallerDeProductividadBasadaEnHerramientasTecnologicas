export default function Root(props: { name: string }) {
  return <section style={{ textAlign: "center" }}>{props.name} is mounted!</section>
}
